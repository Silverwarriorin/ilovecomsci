#include <stdio.h>

int main(int argc, char** argv) {
    long long num;
    size_t count = 0;
    scanf("%lld", &num);

    if (num < 0) num *= -1;

    while (num != 0) {
        count++;
        num /= 10;
    }

    printf("The input number is %d digits long", count);

    return 0;
}
