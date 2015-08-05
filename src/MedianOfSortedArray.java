public class Solution {
        public double findMedianSortedArrays(int A[], int B[]) {
             if(B.length < A.length)
               return findMedianSortedArrays(B,A);
             int m = A.length;
             int n = B.length;
             int iMin = 0;
             int iMax = m;
             while(iMin<=iMax){
                 int i = iMin + (iMax - iMin >> 1);
                 int j = (m + n + 1 >> 1) - i;
                 if(i>0 && j<n && A[i-1]>B[j]){
                     iMax = i-1;
                 }
                 else if(j>0 && i<m && A[i]<B[j-1]){
                     iMin = i+1;
                 }
                 else{
                     int num1 = 0;
                     int num2 = 0;
                     if(i == 0){
                         num1 = B[j-1];
                     }else if(j == 0){
                         num1 = A[i-1];
                     }
                     else{
                         num1 = Math.max(A[i-1],B[j-1]);
                     }
                     if((m+n)%2 == 1){
                         return num1;
                     }
                     else{
                         if(i == m){
                             num2 = B[j];
                         }
                         if(j == n){
                             num2 = A[i];
                         }
                         else{
                             num2 = Math.min(A[i],B[j]);
                         }
                         return (double)(num1+num2)/2;
                     }
                 }
             }
              return -1;
                 
                 
             }
        }