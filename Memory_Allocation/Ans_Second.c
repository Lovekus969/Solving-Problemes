#include <stdio.h>
#include <stdlib.h>

int main() {
    int *p = malloc(5 * sizeof(int));  // Allocating space for 5 integers

    for (int i = 0; i <= 5; i++) {     // FAULT: loop goes from 0 to 5 (6 elements)
        p[i] = i;
        printf("Stored %d at index %d\n", p[i], i);
    }

    free(p);
    return 0;
}

//it will run loop until 5 mean 6 block or 6*4= 24 byte it will give but we have only 5*4 =20 byte aloocation 
