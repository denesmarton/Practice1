import java.util.*;

public class PositiveInteger {
	public PositiveInteger(int num) {
		x = num;
	}

	private int x;

	public boolean isPerfect() {
		int sum = 1;
		for (int i = 2; i < x; i++) {
			if (x % i == 0)
				sum += i;
		}
		if (sum == x && x != 1)
			return true;
		else
			return false;
	}

	public boolean isAbundant() {
		int sum = 1;
		for (int i = 2; i < x; i++) {
			if (x % i == 0)
				sum += i;
		}
		if (sum > x)
			return true;
		else
			return false;
	}

	public boolean isNarcissistic() {
		int num = x;
		int sum = 0;
		int length = String.valueOf(x).length();
		while (num > 0) {
			int digit = num % 10;
			num = num / 10;
			sum += Math.pow(digit, length);
		}
		if (sum == x)
			return true;
		else
			return false;
	}
}