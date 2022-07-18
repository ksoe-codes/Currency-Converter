#include <stdio.h>
#include <math.h>

void main()
{
    float code,rupee,USD,pound,euro,yen;
    printf("\n\n*** Welcome to Currency Converter Project by Ksoe***");
    printf("\nEnter the currency code");
    printf("\n 1:Rupees");
    printf("\n 2:USD");
    printf("\n 3:Pound Sterling");
    printf("\n 4:Euro");
    printf("\n 5:Japanese Yen\n");
    scanf("%f", &code);

    if(code == 1)
    {
        printf("Please Enter amount in Rupees:");
        scanf("%f", &rupee);
        USD = rupee / 79.72;
        printf("\nUSD = %.2f", USD);
        pound = rupee / 94.51;
        printf("\nPound = %.2f", pound);
        euro = rupee / 80.36;
        printf("\nEuro = %.2f", euro);
        yen = rupee / 0.58;
        printf("\nJapanese Yen = %.2f\n\n", yen);
    }

    else if (code == 2)
    {
        printf("\nEnter amount in USD:");
        scanf("%f", &USD);
        rupee = USD / 0.013;
        printf("\nRupees = %.2f", rupee);
        pound = USD / 1.19;
        printf("\nPound = %.2f", pound);
        euro = USD / 1.01;
        printf("\nEuro = %.2f", euro);
        yen = USD / 0.0072;
        printf("\nJapanese Yen = %.2f\n\n", yen);
    }

    else if(code == 3)
    {
        printf("\nEnter amount in Pound:");
        scanf("%f", &pound);
        rupee = pound / 0.011;
        printf("\nRupees = %.2f", rupee);
        USD = pound / 0.084;
        printf("\nUSD = %.2f", USD);
        euro = pound / 0.085;
        printf("\nEuro = %.2f", euro);
        yen = pound / 0.0061;
        printf("\nJapanese Yen = %.2f\n\n", yen);
    }

    else if(code == 4)
    {
        printf("\nEnter amount in Euro:");
        scanf("%f", &euro);
        rupee = euro / 0.012;
        printf("\nRupees = %.2f", rupee);
        USD = euro / 0.099;
        printf("\nUSD = %.2f", USD);
        pound = euro / 1.18;
        printf("\nPound = %.2f", pound);
        yen = euro / 0.0072;
        printf("\nJapanese Yen = %.2f\n\n", yen);
    }

    else if(code == 5)
    {
        printf("\nEnter amount in Japanese Yen:");
        scanf("%f", &yen);
        rupee = yen / 1.74;
        printf("\nRupees = %.2f", rupee);
        USD = yen / 138.53;
        printf("\nUSD = %.2f", USD);
        pound = yen / 164.23;
        printf("\nPound = %.2f", pound);
        euro = yen / 139.69;
        printf("\nEuro = %.2f\n\n", euro);

    }
}


