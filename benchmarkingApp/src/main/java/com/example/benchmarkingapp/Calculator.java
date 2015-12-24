package com.example.benchmarkingapp;

class Calculator {
// method which accepts 2 integer values and returns the sum of the numbers.
	public static int addNumbers(int num1, int num2){
	int sum= num1+num2;
	return sum;
	}

// method which accepts 2 double values and returns the sum of the numbers.
	public static double addNumbers(double num1, double num2){
	double sum=num1+num2;
	return sum;
	}

// method to obtain speed by inputting values for distance and time.
	public static double findSpeed(double time, double distance) {
		double speed = distance/time;
		return speed;
	}

// method to return the area of a circle by inputting radius.
	public static double findAreaOfCircle(double radius){
		final double PI=3.1415;
		double area= radius * radius * PI;
		return area;
	}

//method to return factorial of a number given as input.
	public static int findFactorial(int number){
		int factorial=1;
		for (int prev=number;prev>0;prev--){
			factorial = factorial*prev;
		}
		return factorial;
	}

//method to return true if number given is even and false if not.
	public static boolean checkEvenOrNot(int number){
	if (number%2==0)
	return true;
	else
	return false;
	}

//method to return true if number given is odd and false if not.
	public static boolean checkOddOrNot(int number){
	if (number%2!=0)
		return true;
	else
		return false;
	}

//method to return true if the number given is prime and false if not.
	public static boolean checkPrime(int number){
	int divisor;
	for (divisor=2; divisor<number; divisor++){
		if (number%divisor==0)
		return false;
	}
	return true;
	}

//method to return true if number given is palindrome and false if not.
	public static boolean checkPalindrome(int number){
	int n=number;
	int remainder,reverse=0;
	while (number>0){
	remainder = number%10;
	reverse = (reverse*10) + remainder;
	number = number/10;
	}
	if (reverse==n)
		return true;
	else
		return false;
	}

//method to return Fibonacci series for	a limit given as input.
		public static int generateFibonacci(int limit){
		if ((limit==0) || (limit==1))
			return limit;
		else
			return generateFibonacci(limit-1) + generateFibonacci(limit-2);
		}
		
//method to return true if the number given is divisible by 6 and false if not.
	public static boolean checkDivisibilityBy6(int number){
	if (number%2==0 && number%3==0)
		return true;
	else
		return false;
	}
	
//method to return the time in hours when time in seconds is given as input.
	public static double convertToHours(double number){
		return (number/3600);
	}
	
//method to return the number of digits in a number given as input.
	public static int countDigits(int number){
		int count=0;
		while (number>0){
			number=number/10;
			count++;
		}
		return count;
	}

//method to return the digits repeated twice of a number given as input.
	public static int repeatDigits(int number){
	String digit = ""+number+number;
	int repeatedDigit = Integer.parseInt(digit);
	return repeatedDigit;
	}
//method to return the digits repeated twice of a number given as input.
	public static int repeatDigitsSecondMethod(int number){
	int repeatedDigit= 0;
	int count=0;
	int temp = number;
	while (temp>0){
		temp= temp/10;
		count++;
	}
	repeatedDigit = (number*((int)Math.pow(10,count)))+ number;
	return repeatedDigit;
	}

//method to return the value at the hundreds place of a 4 digit number given as input.
	public static int getHundredsDigit(int number){
	int remainder=0;
	for (int i=0; i<3; i++){
	remainder = number%10;
	number = number/10;
	}
	return remainder;
	}
	
//method to return required run rate.
	public static double getRequiredRunRate(int target, double maxOvers, int currentScore, double oversBowled){
	return ((target-currentScore)/(maxOvers-oversBowled));
	}
	
//method to make and return double value out of three digits given as input.
	public static double makeDecimal(byte num1, byte num2, byte num3){
	double decimal = num1 + (num2*0.1) + (num3*0.01);
	return decimal;
	}
	
//method to return the sum of the digits of the number given as input.
	public static int sumOfDigits(int number){
		int sum=0, remainder=0;
		while(number>0){
			remainder = number%10;
			sum = sum+remainder;
			number=number/10;
		}
		return sum;
	}
	
//method to return the AND of 3 booleans given as input.
	public static boolean andBooleans(boolean n1, boolean n2, boolean n3){
		return (n1&&n2&&n3);
	}
	
//method to return true if first number is greater than any of the rest of the numbers.
	public static boolean checkGreaterThan(int num1, int num2, int num3){
		while (num1-num2>0 || num1-num3>0){
			return true;
		}
			return false;
	}
	
//method to return true if the numbers given are in ascending order.
	public static boolean checkAscendingOrder(int num1, int num2, int num3){
		while (num3-num2>0 && num2-num1>0){
			return true;
		}
			return false;
	}
	
//method to return the sum of the last 4 digits of the number given as input.
	public static int sumOf4Digits(int number){
		int remainder=0;
		int sum=0;
		for (int i=0; i<4; i++){
			remainder = number%10;
			sum = sum + remainder;
			number=number/10;
		}
		return sum;
	}
	
//method to return area of square whose coordinates of diagonal are given.
	public static int areaOfSquare(int x1,int y1,int x2, int y2){
	int diagonalSquare = ((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1));
	int area = diagonalSquare/2; 
	return area;
	}
	
//method to return the sum of three 4 digit numbers formed from three digits given as input.
	public static int addFourDigitNumbers(int num1, int num2, int num3){
	int firstNumber=(num1*1000)+(num1*100)+(num1*10)+num1;
	int secondNumber=(num2*1000)+(num2*100)+(num2*10)+num2;
	int thirdNumber=(num3*1000)+(num3*100)+(num3*10)+num3;
	int sum = firstNumber+secondNumber+thirdNumber;
	return sum;
	}
	
//method to return true if a number is divisible by either 3 or 7.
	public static boolean checkDivisibilityBy3Or7(int number){
	if (number%3==0 || number%7==0)
	return true;
	else
	return false;
	}
	
//method to return the largest number among three numbers given as input.
	public static int findLargestNumber(int num1, int num2, int num3){
	int largest=0;
	if (num1>num2 && num1>num3)
	largest = num1;
	else if (num3>num2 && num1<num3)
	largest = num3;
	else if (num1<num2 && num2>num3)
	largest= num2;
	return largest;
	}
	
//method to return the number of days in the month in 2014 given as input.
	public static int findNumberOfDays(int month){
	if (month==4 || month==6 || month==9|| month==11)
	return 30;
	else if (month==2)
	return 28;
	else if (month==0 || month>12)
	return 0;
	else
	return 31;
	}
	
//method to return changed case of the character given as input or return number if number is given as input.
	public static char changeCase(char ch){
		int characterUnicode = (int) ch;
		if (characterUnicode>64 && characterUnicode<91 )
			characterUnicode = characterUnicode+32;
		else if (characterUnicode>96 && characterUnicode<123)
			characterUnicode = 	characterUnicode - 32;
		char character = (char)characterUnicode;
		return character;
	}
	
//method to return true if the character given is a digit else return false.
	public static boolean checkDigit(char digit){
		int characterUnicode = (int)digit;
		if (characterUnicode>=48 && characterUnicode<=57)
			return true;
		else
			return false;
	}
	
//method to return the middle character among the three characters given as input.
	public static char findMiddleCharacter(char ch1, char ch2, char ch3){
	if ((ch1>ch3&&ch1<ch2)||(ch1<ch3&&ch1>ch2))
		return ch1;
	else if ((ch2>ch3&&ch2<ch1)||(ch2<ch3&&ch2>ch1))
		return ch2;
	else if ((ch3>ch1&&ch3<ch2)||(ch3<ch1&&ch3>ch2))
		return ch3;
	else 
		return '0';
	}
	
//method to return true if last digits of 2 numbers given as input are the same.
	public static boolean checkLastDigit(int num1, int num2){
	int remainder1= num1%10;
	int remainder2= num2%10;
	if (remainder1==remainder2)
	return true;
	else
	return false;
	}
	
//method to return true if sum of any 2 numbers gives the third number given as input.
	public static boolean checkSumOfTwoNumbers(int num1, int num2, int num3){
	if ((num1==num2+num3)||(num2==num1+num3)||(num3==num1+num2))
	return true;
	else
	return false;
	}
	
//method to return reward of lottery ticket number given as input.
	public static int checkRewardOfLottery(int number){
	if ((number%4==0)&&(number%7!=0))
	return 6;
	else if ((number%7==0)&&(number%4!=0))
	return 10;
	else if (number%4==0 && number%7==0)
	return 20;
	else
	return 0;
	}

//method to return sum of rewards of the 3 lottery tickets given as input.
	public static int checkSumOfRewards(int lottery1, int lottery2, int lottery3){
	int reward=0;
	reward = checkRewardOfLottery(lottery1);
	reward = reward + checkRewardOfLottery(lottery2);
	reward = reward + checkRewardOfLottery(lottery3);
	return reward;
	}
	
//method to return the sum of the last 3 digits of the number given as input.
	public static int computeSumOfLast3Digits(int number){
	int remainder = 0;
	int sum = 0;
	for (int count=0; count<3; count++){
		remainder = number%10;
		sum = sum+remainder;
		number=number/10;
	}
	return sum;
	}
	
//method to return a value which compares nearness to 21 among the 2 numbers given as input.
	public static int isNearTo21(int num1, int num2){
	if (num1>21 && num2>21)
	return -1;
	else if (num1==num2 && num1<=21)
	return -2;
	else if (num1<=21 && num2<=21){
		if ((21-num1)<(21-num2))
		return num1;
		else 
		return num2;
		}
	else return	0;
	}

//method to return the reverse of the number given as input.
	public static int reverseOfNumber(int number){
	int reverse=0;
	int remainder=0;
	while (number>0){
	remainder = number%10;
	reverse = (reverse*10)+remainder;
	number=number/10;
	}
	return reverse;
	}
	
//method to return true if the number given is perfect.
	public static boolean isPerfect(int number){
	int sum=0;
	for(int divisor=1; divisor<number; divisor++){
		if (number%divisor==0)
		sum = sum+divisor;
	}
	if (sum==number)
	return true;
	else
	return false;
	}

//method to return an array of natural numbers up to the size given as input.
	public static Integer[] generateNaturalNumbers(int number){
	Integer[] arrayNaturalNumbers = new Integer[number];
	for (int i=0; i<arrayNaturalNumbers.length; i++){
		arrayNaturalNumbers[i] = i+1;
	}
	return arrayNaturalNumbers;
	}
	
//method to return an array of natural numbers up to the size given as input.
	public static Integer[] generateNaturalNumbersDescending(int number){
        Integer[] arrayNaturalNumbers = new Integer[number];
	for (int i=0; i<arrayNaturalNumbers.length; i++){
		arrayNaturalNumbers[i] = (arrayNaturalNumbers.length)-i;
	}
	return arrayNaturalNumbers;
	}

//method to print the array values when an array is given as input.
	public static void printArray(int[] array){
	for (int i=0; i <array.length; i++){
		System.out.print(array[i]);
		System.out.print(" ");
	}
	System.out.println("");
	}
	
//method to clone an array and return the cloned array.
	public static Integer[] cloneArray(Integer[] array){
        Integer[] result = new Integer[array.length];
		for (int i=0; i<result.length; i++){
			result[i] = array[i];
		}
		return result;
	}

//method to return an array of random numbers when size is given as input.
	public static Integer[] generateRandomNumbers(int size){
        Integer[] arrayRandomNumbers = new Integer[size];
	for (int i=0; i<arrayRandomNumbers.length; i++)
		arrayRandomNumbers[i] = (int)(Math.random()*100);
	return arrayRandomNumbers;
	}
	
	
//method to return sum of the elements in an array when the array is given as input.	
	public static int sumOfArrayElements(int[] array){
	int sum = 0;
	for (int i=0; i<array.length; i++){
		sum += array[i];
	}
	return sum;
	}

//method to return array of even numbers between the limits given as input.
	public static int[] generateEvenNumbers(int from, int to){
	int[] arrayEvenNumbers;
	if ((from%2!=0)&&(to%2!=0))
	arrayEvenNumbers = new int[(to-from)/2];
	else
	arrayEvenNumbers =  new int[((to-from)/2)+1];
	int i =0;
	for (int number=from; number<=to; number++){
		if (number%2==0){
			arrayEvenNumbers[i]=number;
			i++;
		}
	}
	return arrayEvenNumbers;
	}

//method to return an array of odd numbers between the limits given as input.
	public static int[] generateOddNumbers(int from, int to){
	int []arrayOddNumbers;
	if ((to%2!=0)||(from%2!=0))
	arrayOddNumbers = new int[((to-from+2)/2)];
	else
	arrayOddNumbers = new int[(to-from)/2];
	int i=0;
	for (int number=from; number<=to; number++){
		if (number%2!=0){
		arrayOddNumbers[i]=number;
		i++;
		}
	}
	return arrayOddNumbers;
	}

//method to generate prime numbers between the limits given as input.
	public static int[] generatePrimeNumbers(int from, int to){
	int[] arrayPrimeNumbers = new int[(to-from)/2+2];
	int count = 0;
	for (int number=from; number<=to; number++){
		if (checkPrime(number)==true){
		arrayPrimeNumbers[count] = number;
		count++;
		}
	}
	
	return arrayPrimeNumbers;
	}
	
//method to return an array of Fibonacci series of a size given as input.
	public static int[] generateFibonacciSeries(int size){
	int[] arrayFibonacci = new int[size];
	int prev=0, nextnum=1;
	int sum = 0;
	for (int i=0; i<arrayFibonacci.length; i++){
		arrayFibonacci[i]=prev;
		sum=prev+nextnum;
		prev=nextnum;
		nextnum=sum;
	}
	return arrayFibonacci;
	}
	
//method to return an array of random characters with its size given as input.
	public static char[] generateRandomChar(int size){
	char[] arrayRandomChar = new char[size];
	for (int i=0; i<arrayRandomChar.length; i++)
		arrayRandomChar[i]=(char)(Math.floor(Math.random() *26) +97);
	return arrayRandomChar;
	}
	
//method to return reverse of an array which is given as input.
	public static int[] reverseArray(int[] array){
	int[] arrayToReverse = array;
	int[] reversedArray = new int[array.length];
	for (int i=0; i<array.length; i++)
		reversedArray[i]=arrayToReverse[array.length-1-i];
	return reversedArray;
	}
	
//method to return number of vowels in the character array given as input.
	public static int countVowels(char[] array){
	char[] arrayVowels = array;
	int numberOfVowels=0;
	for (int i=0; i<array.length; i++){
		if ((int)arrayVowels[i]==97 || (int)arrayVowels[i]==101||(int)arrayVowels[i]==105||(int)arrayVowels[i]==111||(int)arrayVowels[i]==117)
		numberOfVowels++;
	}
	return numberOfVowels;
	}
	
//method to return addition of 2 matrices given as input.
	public static int[] addArrays(int[] array1, int[]array2){
	int[] firstArray = array1;
	int[] secondArray = array2;
	int[] sumOfArray = new int[array1.length];
	for (int i=0; i<array1.length; i++)
	sumOfArray[i]= firstArray[i] + secondArray[i];
	return sumOfArray;
	}
	
//method to return a matrix obtained by multiplying 2 matrices given as input.
	public static int[] multiplyArrays(int[] array1, int[] array2){
	int[] firstArray = array1;
	int[] secondArray = array2;
	int[] productOfArrays = new int[array1.length];
	productOfArrays[0]= (firstArray[0]*secondArray[0]) + (firstArray[1]*secondArray[2]);
	productOfArrays[1]= (firstArray[0]*secondArray[1]) + (firstArray[1]*secondArray[3]);
	productOfArrays[2]= (firstArray[2]*secondArray[0]) + (firstArray[3]*secondArray[2]);
	productOfArrays[3]= (firstArray[2]*secondArray[1]) + (firstArray[3]*secondArray[3]);
	return productOfArrays;
	}

//method to return the run rate when the total runs in each over is given as input.
	public static int calculateRunRate(int[] array){
	int[] arrayRuns = array;
	int sum=0;
	int runRate = 0;
	for (int i=0; i<array.length; i++){
		sum += arrayRuns[i];
	}
	runRate = sum/array.length;
	return runRate;
	}
	
//method to return sum of arguments using ellipsis.
	public static double sumOfArguments(double... numbers){
	double sum = 0;
	for (int i=0; i<numbers.length; i++)
	sum = sum+numbers[i];
	return sum;
	}

//method to sort the array, given as input, in ascending order using bubble sort.
	public static Integer[] bubbleSortArray(Integer[] array){
	int temp=0;
	int i;
	boolean swapped=true; 				//to make sure swapping happens initially.
	while (swapped){					//to do only if swapping happened.
		swapped= false; 				//to check if swapping happens in the checking condition.
		for(i=0; i<array.length-1; i++){
			if (array[i]>array[i+1]){  	//checking first number and second number in the pair.
				temp = array[i];		//swapping the numbers if found not in order.
				array[i] = array[i+1];
				array[i+1] = temp;
				swapped = true;			//declaring that swapping happened.
			}
		}
	}
	return array;
	}
	
//method to sort the array, given as input, in descending order using bubble sort.
	public static Integer[] bubbleSortArrayDescending(Integer[] array){
	int temp=0;
	int i;
	boolean swapped=true; 				//to make sure swapping happens initially.
	while (swapped){					//to do only if swapping happened.
		swapped= false; 				//to check if swapping happens in the checking condition.
		for(i=array.length-2; i>=0; i--){
			if (array[i]<array[i+1]){  	//checking first number and second number in the pair.
				temp = array[i];		//swapping the numbers if found not in order.
				array[i] = array[i+1];
				array[i+1] = temp;
				swapped = true;			//declaring that swapping happened.
			}
		}
	}
	return array;
	}
	
//method to sort the array using merge sort.
	public static Integer[] mergeSort(Integer[] array){
	if (array.length<=1)
		return array;
	Integer[] array1 = new Integer[array.length/2];				//creating first half array.
	Integer[] array2 = new Integer[array.length-array1.length];	//creating second half array.
	for (int i=0; i<array1.length; i++)					//filling first array with values in main array
		array1[i]=array[i];
	for(int i=0; i<array2.length; i++)					//filling second array with values in main array
		array2[i]=array[array1.length+i];
	mergeSort(array1);									//calling mergeSort method where first half array is given as input. 
	mergeSort(array2);									//calling mergeSort method where second half array is given as input.
	merge(array1,array2,array);							//calling merge method to merge both arrays.	
	return array;
	}
	//method to merge 2 arrays to form an array.
	public static void merge(Integer[] array1, Integer[] array2, Integer[] result){
	int i1 = 0;			//setting index of first array to 0
	int i2 = 0;			//setting index of second array to 0
	int i=0;			//setting index of result array to 0
	while (i1 < array1.length && i2 < array2.length) {	//to do only when the condition is true.
		if (array1[i1] < array2[i2]){					
			result[i] = array1[i1];		//pick value from first array if value in first array is less than second one.
			i1++;
		}
		else{
			result[i] = array2[i2];		//pick value from second array otherwise.				
			i2++;
		}
		i++;							//increment index of result array so that the next value can be stored in the next position.
	}

	System.arraycopy(array1, i1, result, i, array1.length - i1);
	System.arraycopy(array2, i2, result, i, array2.length - i2);
	}
	
	
//method to sort an array given as input using selection sort.
	public static Integer[] selectionSortArray(Integer[]  array){
	int highest;
	int temp = 0;
	for (int j=array.length-1; j>0; j--){	// j ranges from 1 less than the array length till 0.
		highest = 0;							//initializing highest number in 0th position.
		for (int i=1; i<=j; i++){			//check numbers from 1st position to j'th position.
			if (array[i]>array[highest]){		//checking between the current highest number and the i'th number.
				highest = i;					//declaring the i'th position as the highest number position.
			}
		}
		temp = array[highest];				//swapping the highest value with j'th position.
		array[highest] = array[j];
		array[j] = temp;
	}
	return array;
	}
	
//method to return the sum of a two-dimensional array given as input.
	public static int add2DimensionalArray(int[][] array){
	int sum = 0;	
		for (int i=0; i<array.length; i++){
			for (int j=0; j<array[i].length;j++){
				sum += array[i][j];
			}
		}
	return sum;
	}
	
//method to do search for an element using binary search.
	public static int binarySearch(int[] array, int key){
	int low = 0;
	int high = array.length-1;
	while (high>=low){
		int mid = ((high+low)/2);
		if (key<array[mid])
			high = mid - 1;
		else if (key == array[mid])
			return mid;
		else 
			low = mid + 1;
	}
	return -1;
	}
	
	
//method to do linear search on an array given as input.
	public static int linearSearch(int[] array, int key){
	int i;
	for (i=0; i<array.length; i++){
		if (key== array[i])
		break;
	}
	return i;
	}
	
//method to sort an array given as input, using insertion sort.
	public static Integer[] insertionSortArray(Integer[] array){
	for (int i = 1; i < array.length; i++) {		//starting with the second element i.e. index 1.
		int valueToAdd = array[i];					//declaring the value to add to the list.
		int j = i;									//transferring the value of index i to j for comparison purpose.
		while (j > 0 && array[j-1] > valueToAdd){ 	//to do only if element to add to the list is less than the one before it.
			array[j] = array[j-1];					//assigning the value of (j-1) index to the next one. 
			j--;									//decrementing value of j for assigning the next value to j in the next step.
		}
		array[j] = valueToAdd;						// j'th element gets the value in 'value to add'
	}
	return array;
	}
	
//method to sort the array using quick sort.
	public static Integer[] quickSort(Integer[] array, int left, int right){
	int i = left;						//declaring the left most index in i
	int j = right;						//declaring the right most index in j
	int pivot = array[(left+right)/2];	//declaring a pivot element so that 2 sections are made in the array.
	while (i<=j){
		while (array[i]< pivot)		//checking whether elements left of pivot is less than the pivot element or not.
			i++;					//incrementing the left most index so that the next one can be checked
		while (array[j]>pivot)		//checking whether the right most elements are greater than the pivot element.
			j--;					//decrementing the right most index to check the number just before it in the next statements.
		if (i<=j){					//do if left index is less than or equal to right index
			int temp = array[i];	
			array[i] = array[j];	//swapping the elements at indices i and j.
			array[j] = temp;
			i++;					//incrementing left index to check for the next element in group
			j--;					//decrementing right index to check for the previous element in the group
		}
	}
	if (left<j)
		quickSort(array, left,j);	//calling the quickSort method for the rest of the operations if condition is true
	if (i<right)
		quickSort(array, i, right);
	
	return array;
	}
	
//methods to sort the array using heap sort.
	public static void heapSortSecondType(int array[], int extend) {
		int left, right, middle, root, temp;
		extend = array.length-1;
		root = (extend-1) / 2;
		
		for(int i=root; i>=0; i--) {
			
			for(int j=root; j>=0; j--) {
				
				left = (2*j) + 1;
				right = (2*j) + 2;
				
				if((left <= extend) && (right <= extend)) {
					if(array[right] >= array[left])
						middle = right;
					else
						middle = left;
				}
				else {
					
					if(right > extend)
						middle = left;
					else
						middle = right;
				}
 
				if(array[j] < array[middle]) {
					
					temp = array[j];
					array[j] = array[middle];
					array[middle] = temp;
				}
			}
		}
		
		temp = array[0];
		array[0] = array[extend];
		array[extend] = temp;
	}

//method to sort an array using heap sort
public static void fnSortHeap(int array[], int arr_ubound){	
	int i;
	int lChild, rChild, mChild, root, temp;
	root = (arr_ubound-1)/2;

	for(i=root;i>=0;i--){
		lChild = (2*i)+1;
		rChild = (2*i)+2;
	if((lChild <= arr_ubound) && (rChild <= arr_ubound)){
		if(array[rChild] >= array[lChild])
			mChild = rChild;
		else
			mChild = lChild;
	}
	else{
	if(rChild > arr_ubound)
		mChild = lChild;
	else
		mChild = rChild;
	}	
	if(array[i] < array[mChild]){
		temp = array[i];
		array[i] = array[mChild];
		array[mChild] = temp;
	}
	}
	temp = array[0];
	array[0] = array[arr_ubound];
	array[arr_ubound] = temp;
	return;
	}
	
//method to sort an array using heap sort.
	static int N;
	public static void heapSort(Integer arr[]){
		heapify(arr);        
		for (int i = N; i > 0; i--){
			swap(arr,0, i);
			N = N-1;
			maxheap(arr, 0);
		}
	}

//method to build a heap
	public static void heapify(Integer arr[]){
		N = arr.length-1;
		for (int i = N/2; i >= 0; i--)
			maxheap(arr, i);        
	}

//method to swap largest element in heap
	public static void maxheap(Integer arr[], int i){
		int left = 2*i ;
		int right = 2*i + 1;
		int max = i;
		if (left <= N && arr[left] > arr[i])
			max = left;
		if (right <= N && arr[right] > arr[max])        
			max = right;
		if (max != i){
			swap(arr, i, max);
			maxheap(arr, max);
		}
	}
    
//method to swap two numbers in an array
	public static void swap(Integer arr[], int i, int j){
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp; 
	}
	
}	