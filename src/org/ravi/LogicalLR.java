package org.ravi;
public class LogicalLR {
    public static void main(String[] args) {
        String pattern = "R.R...LLL.RR....LL.R....L";
        char[] arr = pattern.toCharArray();
        boolean right = false;
        int rightAt = -1;
        int leftAt = -1;
        int cnt = 0;
        boolean left = false;
        for(int i=0; i<arr.length;i++){
            cnt++;
            if(arr[i]=='L'){
                left = true;
                right = false;
                leftAt = i;
            } else if(arr[i] == 'R'){
                rightAt = i;
                right = true;
            }
            if(arr[i] == '.' && right){
                arr[i] = 'R';
            } else if(left && arr[i-1]!='L'){
                if(rightAt!=-1) {
                    boolean avoid = (leftAt-rightAt-1)%2 != 0;
                     int loop = i-((i-rightAt)/2);
                    for (int k = i-1; k > loop - 1; k--){
                        cnt++;
                        arr[k] = 'L';
                        if(k==((i+rightAt)/2) && avoid){
                            arr[k] = '.';
                        }
                    }
                } else {
                    for(int k=i-1 ; k >= 0; k--){
                        cnt++;
                        if(arr[k]=='.') {
                            arr[k] = 'L';
                        } else if(arr[k] == 'L'){
                            break;
                        }
                    }
                }
                left = false;
            }
        }
        System.out.println(String.valueOf(arr));
        System.out.println("Time consistency : " + cnt);
    }
}
