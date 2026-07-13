package com.goalmoney.personal;
import android.app.*;import android.appwidget.*;import android.content.*;import android.widget.*;import java.text.*;import java.util.*;
public class GoalMoneyWidget extends AppWidgetProvider {
 static String m(long v){return NumberFormat.getNumberInstance(new Locale("vi","VN")).format(v)+" ₫";}
 static void u(Context c,AppWidgetManager am,int id){SharedPreferences p=c.getSharedPreferences("goal_widget",0);RemoteViews v=new RemoteViews(c.getPackageName(),R.layout.widget_goalmoney);v.setTextViewText(R.id.widget_total,m(p.getLong("total",0)));Intent open=new Intent(c,MainActivity.class);v.setOnClickPendingIntent(R.id.widget_root,PendingIntent.getActivity(c,0,open,PendingIntent.FLAG_UPDATE_CURRENT|PendingIntent.FLAG_IMMUTABLE));Intent inc=new Intent(c,MainActivity.class).putExtra("quick_type","income");Intent exp=new Intent(c,MainActivity.class).putExtra("quick_type","expense");v.setOnClickPendingIntent(R.id.widget_income,PendingIntent.getActivity(c,1,inc,PendingIntent.FLAG_UPDATE_CURRENT|PendingIntent.FLAG_IMMUTABLE));v.setOnClickPendingIntent(R.id.widget_expense,PendingIntent.getActivity(c,2,exp,PendingIntent.FLAG_UPDATE_CURRENT|PendingIntent.FLAG_IMMUTABLE));am.updateAppWidget(id,v);}
 public static void refreshAll(Context c){AppWidgetManager a=AppWidgetManager.getInstance(c);for(int id:a.getAppWidgetIds(new ComponentName(c,GoalMoneyWidget.class)))u(c,a,id);}
 @Override public void onUpdate(Context c,AppWidgetManager a,int[] ids){for(int id:ids)u(c,a,id);}
 @Override public void onEnabled(Context c){refreshAll(c);}
}
