class NestedIfDemo{
public static void main(String[] args){
boolean isAptitudeRoundClear=true;
boolean isTechnicalRoundClear=true;
boolean isHRRoundClear=true;
if(isAptitudeRoundClear){
if(isTechnicalRoundClear){
if(isHRRoundClear){
System.out.println("Congratulations!..you are selected");
}
else{
System.out.println("Sorry..you did not cleared HR round");
}
}
else{
System.out.println("Sorry..you did not cleared Technical round");
}
}
else{
System.out.println("Sorry..you did not cleared Aptitude round");
}
}
}