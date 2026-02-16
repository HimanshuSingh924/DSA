class Solution {
    public int reverseBits(int n) {
    
		String binary = String.format("%32s",
								Integer.toBinaryString(n))
								.replace(' ', '0');
	
		char[] ch = binary.toCharArray();
	
		int i = 0, j = ch.length - 1;

		while (i < j)
		{
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;

			i++;
			j--;
		}

		String reversed = new String(ch);
		int result = Integer.parseUnsignedInt(reversed, 2);

        return result;
    }
}