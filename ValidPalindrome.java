class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        Stack<Character> stack = new Stack<>();
        List<Character> arr = new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
                arr.add(s.charAt(i));
        }
        int mid = arr.size()/2;
        for(int i=0;i<=mid;i++)
        {
                stack.push(arr.get(i));
        }
        
        Iterator value = stack.iterator();
  
        
        System.out.println("The iterator values are: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }
        
        for(int i=0;i<arr.size();i++)
            System.out.print(arr.get(i));
        
        for(int i=mid;i<arr.size();i++)
        {
            char x = stack.pop();
            System.out.println("str is "+ arr.get(i) +" and stack is "+x);
            if(Character.compare(arr.get(i),x)!=0)
                return false;
        }
        return true;
    }
}
