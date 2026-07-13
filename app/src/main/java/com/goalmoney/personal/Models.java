package com.goalmoney.personal;
public class Models {
 public static class Goal { public long id,target,current; public String name,type,deadline; public Goal(long i,String n,String ty,long t,long c,String d){id=i;name=n;type=ty;target=t;current=c;deadline=d;} }
 public static class Tx { public long id,amount,goalId; public String type,title,from,to,date,time,note,category; public Tx(long i,String ty,String ti,String f,String tt,long a,long g,String d,String tm,String n,String cat){id=i;type=ty;title=ti;from=f;to=tt;amount=a;goalId=g;date=d;time=tm;note=n;category=cat;} }
}
