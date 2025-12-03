#include <stdio.h>
#include <stdlib.h>

int main() {
    // malloc version (uninitialized memory)
    int *a = malloc(5 * sizeof(int));
    
    // calloc version (initialized to zero)
    int *b = calloc(5, sizeof(int));

    printf("malloc values:\n");
    for (int i = 0; i < 5; i++) {
        printf("%d ", a[i]);   // garbage values
    }

    printf("\n\ncalloc values:\n");
    for (int i = 0; i < 5; i++) {
        printf("%d ", b[i]);   // all zeros
    }

    free(a);
    free(b);
    return 0;
}
