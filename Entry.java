
import com.opencsv.CSVWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
class Entry
{
 public int qty;
 public int ct;
 public String model;
 static int ctr;
 public void printEntry()
 {
     System.out.println(model+"t"+qty+"t"+ct);
 }
 public void setModel(String s)
 {
     model=s;
 }
 void getOptimum(Entry[] e,int ct,String[] pend) throws IOException
 {
      FileWriter writetoc= new FileWriter("result.csv");
             CSVWriter wtoc=new CSVWriter(writetoc);
             wtoc.flush();
             wtoc.close();
             writetoc.close();
     ArrayList <Entry> ela = new ArrayList();
     ArrayList <Entry> elb = new ArrayList();
     ArrayList <Entry> elc = new ArrayList();
     ArrayList <Entry> eld = new ArrayList();
     ArrayList <Rank> rankw= new ArrayList();
     ArrayList <Rank> ranko= new ArrayList();
     int i;    
     ctr=ct;
     Rank epend=new Rank();
     int flag=0;
     for(Entry entryi : e)
     {
         if(entryi.model!=null)
     {
         if(pend[0]!=null && pend[0].equals(entryi.model) && Integer.parseInt(pend[2])>0 )
         {
             entryi.qty+=Integer.parseInt(pend[2]);
             flag=1;
         }
         if(entryi.ct<=ctr)
             ela.add(entryi);
         else
             elb.add(entryi);      
     }
     }
     for(Entry entryi : e)
     {
             if(entryi.model!=null)
             {
         if(entryi.ct<ctr)
             elc.add(entryi);
         else
             eld.add(entryi);      
     }
     }
    Collections.sort(ela,new Sortbyct().reversed());
    Collections.sort(elb,new Sortbyct());
    ela.addAll(elb);
    elb.clear();
    Collections.sort(eld,new Sortbyct());
    Collections.sort(elc,new Sortbyct().reversed());
    eld.addAll(elc);
    elc.clear();
    int p;float t1=0,t2=0;
    System.out.println("First possibility:");
    int comp;
    for(p=0;p<ela.size()-1;p++)
    {
    System.out.print(ela.get(p).ct+"\t");
    if(ela.get(p).ct<ela.get(p+1).ct)
    {
        comp=ela.get(p).qty;
    }
    else
    {
        comp=ela.get(p+1).qty;
    }
    t1+=abs(ela.get(p+1).ct-ela.get(p).ct)*comp;
    } 
    System.out.println("T1= "+t1);
    System.out.println("Second possibility:");
      for(p=0;p<eld.size()-1;p++)
    {
    System.out.print(eld.get(p).ct+"\t");
    if(eld.get(p).ct<eld.get(p+1).ct)
    {
        comp=eld.get(p).qty;
    }
    else
    {
        comp=eld.get(p+1).qty;
    }
    t2+=abs(eld.get(p+1).ct-eld.get(p).ct)*comp;
    }
    System.out.println("T2= "+t2);
    if(t1>=t2)
    {
        ela.clear();
    ela.addAll(eld);
    }
       FileWriter filewriter= new FileWriter("result.csv");         
         CSVWriter writer= new CSVWriter(filewriter); 
          String[] temps = new String[3];
          String[] temps2={"Model","Cycle Time", "Quantity"};
          writer.writeNext(temps2);
          Entry prev=new Entry();
          if(pend[0]!=null && flag==0 && Integer.parseInt(pend[2])>0)
          {
              writer.writeNext(pend);
          }
            for (Entry entry2 : ela) {
                if(entry2.model == null)
                    break;
                if(entry2.model.equals(prev.model))
                {
                 prev.qty+=entry2.qty;
                entry2.qty=0;
                }
                else
                {
                prev=entry2;
                }
            }
            for (Entry entry1 : ela) {
                if(entry1.model == null)
                    break;
                if(entry1.qty==0)
                    continue;
                else
                {
                temps[0] = entry1.model;
                temps[1] = Integer.toString(entry1.ct);
                temps[2] = Integer.toString(entry1.qty);
                writer.writeNext(temps);
                prev=entry1;
                }
            }
          writer.close();
          filewriter.close();
          //THE FOLLOWING CODE IS AN UNDER TEST CODE FOR AN ADDITIONAL FUNCTIONALITY
//          int rc=0;
//          int rco=0;
//         if(pend[0]!=null && flag==0)
//         {
//             epend.mod=pend[0];
//             epend.ra=++rc;
//             rankw.add(epend);
//             ranko.add(epend);
//             rco=rc;
//         }
//           for(i=0;i<ela.size();i++)
//     {
//         epend.mod=e[i].model;
//         epend.ra=++rc;
//         rankw.add(epend);
//          
//     }
//           rc=rco;
//           for(i=0;i<ela.size();i++)
//           {
//            epend.mod=ela.get(i).model;
//            epend.ra=++rc;
//            ranko.add(epend);
//            
//           }
//          
//        ArrayList<Rank> fina= new ArrayList();
//        Entry rest[]= new Entry[26];
//        int j,k,m,ri=0;
//        int gflag=0, kflag=0;
//        for(i=0;i<(ranko.size());i++)
//        {
//            for(j=0;j<ranko.size()/2;j++)
//            {
//            if(ranko.get(i).mod.equals(rankw.get(j).mod))
//            {
//                for(k=0;k<rankw.size()/2;k++)
//                {
//                    for(m=0;m<fina.size();m++)
//                    {
//                        if((rankw.get(j).ra+k)==fina.get(m).ra)
//                        {
//                        gflag=1;
//                        break;
//                        }
//                    }
//                    if(ranko.get(i).ra<=rankw.get(j).ra+k && gflag==1)
//                    {
//                       epend.mod=ranko.get(i).mod;
//                       epend.ra=rankw.get(j).ra+k;
//                       fina.add(epend);
//                       kflag=1;
//                       break;
//                    }
//                    
//                                  }
//                if(kflag==1)
//                    break;
//            }
//        }
//            if(kflag==0)
//            {
//                rest[ri].model=ranko.get(i).mod;
//               for(m=0;m<ela.size();m++)
//               {
//                   if(ela.get(m).model.equals(ranko.get(i).mod))
//                   {
//                       rest[ri].ct=ela.get(m).ct;
//                       rest[ri].qty=ela.get(m).qty;
//                       ri++;
//                       break;
//                   }
//                       
//               }
//            }
//         
//        }
//        for(i=0;i<fina.size();i++)
//        {
//            System.out.println(fina.get(i).mod + " "+ fina.get(i).ra);
//        }
//            System.out.println("REST");
//        for(i=0;i<rest.length;i++)
//        {
//            System.out.println(rest[i].model+ " "+ rest[i].ct+ " "+ rest[i].qty);
//        }
 }
 float abs(float s)
 {
     if(s<0)
         s*=-1;
     return s;
}
}
class Sortbyct implements Comparator<Entry>
{
    public int compare(Entry a, Entry b)
    {
        return a.ct-b.ct;
    }
}
class Rank
{
    int ra;
    String mod;
}
