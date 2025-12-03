#include <stdio.h>
#include <stdlib.h>

int main() {
    int *p = malloc(sizeof(int));  // Allocate space for ONE int
    *p = 10;

    printf("p[0] = %d\n", *p);

    // Accessing memory OUTSIDE allocated block
    printf("p[1] = %d\n", *(p + 1));

    free(p);
    return 0;
}


//This allocates exactly 4 bytes (on most systems).
