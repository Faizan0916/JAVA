import re
from collections import Counter

data = [
    {"Text": "team wins match", "Class": "Sports"},
    {"Text": "team plays match", "Class": "Sports"},
    {"Text": "player wins game", "Class": "Sports"},
    {"Text": "government wins election", "Class": "Politics"},
    {"Text": "government passes law", "Class": "Politics"},
    {"Text": "election law policy", "Class": "Politics"}
]

test_text = "team wins game"


# Step 1: Preprocessing
def preprocess(text):
    text = text.lower()
    words = re.findall(r'\b[a-z]+\b', text)

    stop_words = {"the", "is", "a", "an", "and", "of", "in", "to"}
    words = [word for word in words if word not in stop_words]

    return words


# Step 2: Count words in each class
class_word_counts = {}
class_doc_counts = Counter()
total_words_in_class = Counter()
vocabulary = set()

for document in data:
    label = document["Class"]
    words = preprocess(document["Text"])

    class_doc_counts[label] += 1

    if label not in class_word_counts:
        class_word_counts[label] = Counter()

    class_word_counts[label].update(words)
    total_words_in_class[label] += len(words)
    vocabulary.update(words)

vocabulary = sorted(vocabulary)

total_documents = len(data)
vocab_size = len(vocabulary)

print("Class Labels:", list(class_doc_counts.keys()))
print("\nVocabulary:", vocabulary)


# Step 3: Calculate prior probabilities
prior = {}

print("\nPrior Probabilities:")

for label in class_doc_counts:
    prior[label] = class_doc_counts[label] / total_documents
    print(label, "=", round(prior[label], 4))


# Step 4: Display word counts
print("\nWord Counts:")

for label in class_doc_counts:
    print("\nClass:", label)

    for word in vocabulary:
        print(word, ":", class_word_counts[label][word])


# Step 5: Calculate conditional probabilities
conditional_prob = {}

print("\nConditional Probabilities:")

for label in class_doc_counts:
    conditional_prob[label] = {}

    print("\nClass:", label)

    for word in vocabulary:
        word_count = class_word_counts[label][word]

        # Laplace smoothing
        probability = (word_count + 1) / (
            total_words_in_class[label] + vocab_size
        )

        conditional_prob[label][word] = probability
        print(word, "=", round(probability, 4))


# Step 6: Prepare the test document
test_words = preprocess(test_text)
test_word_counts = Counter(test_words)

print("\nTest Document:", test_text)

test_vector = [test_word_counts[word] for word in vocabulary]
print("Test Word Frequency Vector:", test_vector)


# Step 7: Calculate posterior scores
scores = {}

print("\nPosterior Scores:")

for label in class_doc_counts:
    score = prior[label]

    for word, frequency in test_word_counts.items():
        if word in vocabulary:
            score *= conditional_prob[label][word] ** frequency

    scores[label] = score
    print(label, "=", round(score, 8))


# Step 8: Predict the class
predicted_class = max(scores, key=scores.get)

print("\nPredicted Class:", predicted_class)