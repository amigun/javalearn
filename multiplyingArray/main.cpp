#include<iostream>

int main() {
	int arr[] = {1, 2, 3, 4};
	int result = 1;

	for (int value = 0; value < sizeof(arr) / sizeof(arr[0]); ++value) {
		result *= arr[value];
	}

	std::cout << "Result: " << result << std::endl;
}
