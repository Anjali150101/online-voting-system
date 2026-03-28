CREATE DATABASE IF NOT EXISTS online_voting_system;
USE online_voting_system;

CREATE TABLE IF NOT EXISTS Users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    voter_id VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
    has_voted BOOLEAN DEFAULT FALSE
);

CREATE TABLE IF NOT EXISTS Candidates (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    party VARCHAR(100) NOT NULL,
    symbol VARCHAR(100) NOT NULL,
    votes INT DEFAULT 0
);

CREATE TABLE IF NOT EXISTS Admin (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(100) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL
);

-- Insert default admin (Password is 'admin123' without hashing for simplicity, or we can assume it will be checked carefully in code. Let's make it plain for admin if needed, or hashed. Code will handle plain text for admin, or better: MD5 for all)
INSERT IGNORE INTO Admin (username, password) VALUES ('admin', 'admin123');
