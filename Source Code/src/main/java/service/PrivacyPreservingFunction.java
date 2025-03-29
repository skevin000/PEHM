package service;

// Implements the privacy-preserving function for data encryption
public class PrivacyPreservingFunction {
    private static final int KEY = 12345; // Example key for encryption

    // Encrypts data using a simple hash function
    public static int encrypt(int data, int cycle) {
        return (data + KEY) * cycle;
    }

    // Encrypts query conditions
    public static int encryptQuery(int query, int cycle) {
        return (query + KEY) * cycle;
    }
}