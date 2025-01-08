class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        
        int XC = Math.max(x1,Math.min(x2,xCenter));
        int YC = Math.max(y1,Math.min(y2,yCenter));

        int distanceX = xCenter - XC;
        int distanceY = yCenter - YC;
        if(distanceX * distanceX + distanceY*distanceY <= radius*radius){
            return true;
        }
        return false;
    }
}
