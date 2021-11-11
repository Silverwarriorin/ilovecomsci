#include <stdio.h>
#include <stdlib.h>

int main(int argc, char** argv) {
    int *v;

    v = malloc(sizeof(int)*4);

    for (int i = 0; i < 4; i++) {
        printf("\nEnter number %d: ", i+1);
        scanf("%d", &v[i]);
    }

    for (int i = 1; i < 4; i++) {
        if (v[i] != v[i-1]) {
            printf("\nNot two pairs");
            return 0;
        } 
    }

    free(v);

    printf("\nTwo pairs");
    return 0;


}
