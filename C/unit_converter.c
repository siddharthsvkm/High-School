#include <stdio.h>
#include <string.h>

double convertValue(double, char[]);
char* convertUnits(char[]);

int main() {
    int testCases;
    scanf("%d",&testCases);
    for (int i = 0; i < testCases; i++){
        char unit[4];
        double value;
        scanf("%lf %s",&value, unit);
        
        char *finalUnit = convertUnits(unit);
        double finalValue = convertValue(value, unit);
        printf("%.6lf %s\n", finalValue, finalUnit);
    }
    return 0;
}


double convertValue(double value, char units[]) {
    double final;
    if (strcmp(units, "m") == 0) {
        final = value * 3.2808;
    } else if (strcmp(units, "ft") == 0) {
        final = value / 3.2808;
    } else if (strcmp(units, "g") == 0) {
        final = value * 0.002205;
    } else if (strcmp(units, "lbs") == 0){
        final = value / 0.002205;
    } else if (strcmp(units, "c") == 0) {
        final = 32 + value * 1.8;
    } else {
        final = (value - 32) * 1.8;
    }
    return final;
}
char* convertUnits(char unit[]) {
    static char units[4]; 
    if (strcmp(unit, "m") == 0) {
        units[0] = 'f';
        units[1] = 't';
        units[2] = '\0';
    } else if (strcmp(unit, "ft") == 0) {
        units[0] = 'm';
        units[1] = '\0';
    } else if (strcmp(unit, "g") == 0) {
        units[0] = 'l';
        units[1] = 'b';
        units[2] = 's';
        units[3] = '\0';
    } else if (strcmp(unit, "lbs") == 0){
        units[0] = 'g';
        units[1] = '\0';
    } else if (strcmp(unit, "c") == 0) {
        units[0] = 'f';
        units[1] = '\0';
    } else {
        units[0] = 'c';
        units[1] = '\0';
    }
    return units;
}
