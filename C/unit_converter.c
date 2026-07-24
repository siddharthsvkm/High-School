#include <stdio.h>
#include <string.h>

int main() {
    int testCases;
    scanf("%d",&testCases);
    int i;
    for (i = 0; i < testCases; i++){
        char units[4];
        double firstValue;
        scanf("%lf %s",&firstValue, units);
        
        double final;
        if (strcmp(units, "m") == 0) {
            final = firstValue * 3.2808;
            units[0] = 'f';
            units[1] = 't';
            units[2] = '\0';
        } else if (strcmp(units, "ft") == 0) {
            final = firstValue / 3.2808;
            units[0] = 'm';
            units[1] = '\0';
        } else if (strcmp(units, "g") == 0) {
            final = firstValue * 0.002205;
            units[0] = 'l';
            units[1] = 'b';
            units[2] = 's';
            units[3] = '\0';
        } else if (strcmp(units, "lbs") == 0){
            final = firstValue / 0.002205;
            units[0] = 'g';
            units[1] = '\0';
        } else if (strcmp(units, "c") == 0) {
            final = 32 + firstValue * 1.8;
            units[0] = 'f';
            units[1] = '\0';
        } else {
            final = (firstValue - 32) * 1.8;
            units[0] = 'c';
            units[1] = '\0';
        }
        
        printf("%.6lf %s \n", final, units);
    }
    return 0;
}
