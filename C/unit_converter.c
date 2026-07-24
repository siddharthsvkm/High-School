// Siddharth Sivakumar
// July, 24, 2026
// Smart Unit Converter
/* The purpose of this program is to convert metric measurements to 
imperial system values. Measurements are in meters, grams or degrees 
Celsius and converted to feet, pounds and degrees Fahrenheit. */

// Import the <stdio.h> and <string.h> libraries to enable input/output and use strings, respectively.
#include <stdio.h>
#include <string.h>

// Function prototypes for convertValue and convertUnits
double convertValue(double, char[]);
char* convertUnits(char[]);

int main() {
    // User inputs the number of testcases
    int testCases;
    scanf("%d",&testCases);
    // Use loop to implement the repition of input and ouput
    for (int i = 0; i < testCases; i++){
        // User inputs the value and unit to be converted
        char unit[4];
        double value;
        scanf("%lf %s",&value, unit);

        // Calculate and print the converted value to 6 decimal places and unit
        char *finalUnit = convertUnits(unit);
        double finalValue = convertValue(value, unit);
        printf("%.6lf %s\n", finalValue, finalUnit);
    }
    return 0;
}

// Function that returns a double of the converted value
double convertValue(double value, char units[]) {
    double final;
    // Meter to Feet
    if (strcmp(units, "m") == 0) {
        final = value * 3.2808;
    } 
    // Feet to Meter
    else if (strcmp(units, "ft") == 0) {
        final = value / 3.2808;
    } 
    // Gram to Pound
    else if (strcmp(units, "g") == 0) {
        final = value * 0.002205;
    }
    // Pound to Gram
    else if (strcmp(units, "lbs") == 0){
        final = value / 0.002205;
    } 
    // Celsius to Fahrenheit
    else if (strcmp(units, "c") == 0) {
        final = 32 + value * 1.8;
    } 
    // Fahrenheit to Celsius
    else {
        final = (value - 32) * 1.8;
    }
    return final;
}

// Function that returns a string of the converted unit
char* convertUnits(char unit[]) {
    // Create char array that holds characters of final unit name
    static char units[4]; 
    // Meter to Feet
    if (strcmp(unit, "m") == 0) {
        units[0] = 'f';
        units[1] = 't';
        units[2] = '\0';
    } 
    // Feet to Meter
    else if (strcmp(unit, "ft") == 0) {
        units[0] = 'm';
        units[1] = '\0';
    } 
    // Gram to Pound
    else if (strcmp(unit, "g") == 0) {
        units[0] = 'l';
        units[1] = 'b';
        units[2] = 's';
        units[3] = '\0';
    } 
    // Pound to Gram
    else if (strcmp(unit, "lbs") == 0){
        units[0] = 'g';
        units[1] = '\0';
    } 
    // Celsius to Fahrenheit
    else if (strcmp(unit, "c") == 0) {
        units[0] = 'f';
        units[1] = '\0';
    } 
    // Fahrenheit to Celsius
    else {
        units[0] = 'c';
        units[1] = '\0';
    }
    return units;
}
