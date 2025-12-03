#include <stdio.h>
#include <stdlib.h>

int main() {
    int *p = malloc(5 * sizeof(int));

    if (p == NULL) {
        printf("Initial malloc failed\n");
        return 1;
    }

    // SAFE REALLOC
    int *temp = realloc(p, 100 * sizeof(int));

    if (temp == NULL) {
        printf("Realloc failed — old memory is still safe\n");
        free(p);        // Free the original
        return 1;
    }

    // Realloc successful
    p = temp;

    printf("Realloc success, memory expanded!\n");

    free(p);
    return 0;
}

//Never assign realloc() directly to your original pointer.
// Use a temporary pointer to avoid memory leaks if realloc fails
