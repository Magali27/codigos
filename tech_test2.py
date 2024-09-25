import hashlib
import time

# Function to simulate Bitcoin's Proof of Work
def proof_of_work(block_data, difficulty):
    nonce = 0
    target = '0' * difficulty  # A string of '0's for difficulty target
    start_time = time.time()  # Start the timer
    
    while True:
        # Create a hash input by combining block data and nonce
        block_hash_input = block_data + str(nonce)
        # Generate SHA-256 hash
        block_hash = hashlib.sha256(block_hash_input.encode()).hexdigest()
        
        # Check if the hash meets the difficulty target
        if block_hash[:difficulty] == target:
            end_time = time.time()  # Stop the timer
            return nonce, block_hash, end_time - start_time
        else:
            nonce += 1  # Increment nonce and try again

# Test the function with different difficulty levels
block_data = "block_data_example"
difficulty_levels = [2, 3, 4]  # Different difficulty levels to test

results = []

# Run the Proof of Work for each difficulty level
for difficulty in difficulty_levels:
    nonce, block_hash, mining_time = proof_of_work(block_data, difficulty)
    results.append((difficulty, nonce, block_hash, mining_time))

results
