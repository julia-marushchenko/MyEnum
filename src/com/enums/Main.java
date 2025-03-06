package com.enums;

// Enum class
enum Color {
    RED, BLUE, GREY, BROWN, BLACK, YELLOW, PINK, GREEN
}

// Class
public class Main {

    // Method main to run java program
    public static void main(String[] args) {

        // Creating variable color with initialiyed value from enum class Color
        Color color = Color.GREEN;

        // Printing value of color to console
        System.out.println(color);

    }
}