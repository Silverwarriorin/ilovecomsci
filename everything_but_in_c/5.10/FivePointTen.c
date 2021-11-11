#include <stdio.h>
#include <stdlib.h>
#include "main.h"

int main(int argc, char** argv) {
    Employee e;
    printf("Enter name of Employee: ");
    scanf("%s", e.name);

    printf("\nEnter salary of %s: ", e.name);
    scanf("%f", e.salary);

    printf("\nEnter number of hours %s worked: ", e.name);
    scanf("%f", e.hours);

    printf("%s is owed $%.2f", e.name, computePay(&e));
}

double computePay(Employee *e) {
    if (e->hours > 40) {
        return (40 * e->salary) + ((e->hours - 40) * (e->salary * 1.5));
    } else {
        return e->hours * e->salary;
    }
}
