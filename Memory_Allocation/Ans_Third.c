#include <stdio.h>
#include <stdlib.h>

int main() {
    int *p = malloc(3 * sizeof(int));

    p[0] = 10;
    p[1] = 20;
    p[2] = 30;

    free(p);

    printf("%d\n", p[1]);   // <— Using memory after free

    return 0;
}
// will cause an immediate crash, which is safer than silent corruption.
