#include <iostream>
using namespace std;

int binarysearch(int a[], int n, int k)
{
    int s = 0;
    int e = n;
    while (s < e)
    {
        int mid = (s + e) / 2;

        if (a[mid] == k)
        {
            return mid;
        }
        else if (a[mid] > k)
        {

            e = mid - 1;
        }
        else
        {
            e = mid + 1;
        }
    }
    return -1;
}

int main()
{

    int n, key;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
        cin >> arr[i];
    cin >> key;
    cout << binarysearch(arr, n, key);
}