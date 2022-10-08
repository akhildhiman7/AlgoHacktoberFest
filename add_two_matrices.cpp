#include <iostream>
using namespace std;

int main()
{
    int r, c, i, j;
    int m[100][100], n[100][100], sum[100][100];

    cout << "Enter number of rows (between 1 and 100): ";
    cin >> r;

    cout << "Enter number of columns (between 1 and 100): ";
    cin >> c;

    cout << endl << "Enter elements of 1st matrix: " << endl;

    // Storing elements of first matrix entered by user.
    for(i = 0; i < r; i++){
       for(j = 0; j < c; j++)
       {
           cout << "Enter element m" << i + 1 << j + 1 << " : ";
           cin >> m[i][j];
       }
    }

    // Storing elements of second matrix entered by user.
    cout << endl << "Enter elements of 2nd matrix: " << endl;
    for(i = 0; i < r; i++){
       for(j = 0; j < c; j++)
       {
           cout << "Enter element n" << i + 1 << j + 1 << " : ";
           cin >> n[i][j];
       }
    }

    // Adding Two matrices
    for(i = 0; i < r; i++){
        for(j = 0; j < c; j++)
            sum[i][j] = m[i][j] + n[i][j];
    }

    // Displaying the resultant sum matrix.
    cout << endl << "Sum of two matrix is: " << endl;
    for(i = 0; i < r; i++){
        for(j = 0; j < c; j++)
        {
            cout << sum[i][j] << "  ";
        }
        cout<<endl;
    }

    return 0;
}