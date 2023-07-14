package ClassText;
class Easy {
    public static void main(String[] args) {
        int[] arr=new int[]{4,5,6,7,8,9,0,1,2,3};
        int target=2;
        System.out.println(search(arr,target));
    }
    public static int search(int[] arr, int target) {
        if(arr.length==0) return -1;
        int left=0,right=arr.length-1;
        while(left<=right) {
            int mid=(left+right)/2;
            if(arr[mid]==target) return mid;
            if(arr[left]<=arr[mid]) {//左边有序
                if(arr[left]<=target&&target<arr[mid])//target在有序区间内
                    right=mid-1;
                else
                    left=mid+1;
            }
            else {                     //右边有序
                if(arr[mid]<target&&target<=arr[right])
                    left=mid+1;
                else
                    right=mid-1;
            }
        }
        return -1;
    }
}