#include <stdio.h>

#include <string.h>

// Print all the rotated string.
void printRotatedString(char str[])
{

    int len = strlen(str);
    for (int i = 0; i < len; i++)
    {
        int k = 0; // Current index in temp // Copying the second part from the point // of rotation.

        // Generate all rotations one by one and print

        char temp[len];
        for (int i = 0; i < len; i++)
        {
            int j = i; // Current index in str

            while (str[j] != '\0')
            {

                temp[k] = str[j];

                k++;
                j++;
            }

            // Copying the first part from the point // of rotation.

            j = 0;

            while (j < i)
            {

                temp[k] = str[j];

                j++;
                k++;
            }

            if (temp[0] = 'p')
            {
                printf("%s", temp);
                break;
            }
        }
    }
}
    // Driven Program
    int main()
    {
        char str[] = "sample";
        printRotatedString(str);
        return 0;
    }
