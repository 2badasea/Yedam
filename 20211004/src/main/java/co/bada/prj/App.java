package co.bada.prj;

import co.bada.prj.product.LgTV;
import co.bada.prj.product.MyPrint;
import co.bada.prj.product.Pencil4B;
import co.bada.prj.product.Pencil6B;
import co.bada.prj.product.SamsungTV;
import co.bada.prj.service.Pencil;
import co.bada.prj.service.RemoteController;
import co.bada.prj.tryexam.TryCatchTest;

/**
 * 1. 일반적인 클래스의 경우 필드, 생성자, 메서드를 구성 멤버로 가지는데, 인터페이스 클래스는
 *	상수 필드와 추상 메소드만을 구성멤버로 가질 수 있다. 또한 인터페이스는 객체를 생성할 수 없기
 *	때문에 기본적으로 생성자를 가질 수 없다. 
 * 2. 인터페이스에서 상수 필드값들은 변경이 되지 않는다. 굳이 붙이지 않더라도 컴파일 과정에서
 * 	알아서 'final static'이 붙는다. 
 */
public class App 
{
    public static void main( String[] args )
    {
        RemoteController tv = new SamsungTV();  //import를 안 해주니 에러. 패키지가 달라서.
//   SamsungTV tv  = new SamsungTV(); //자기 자신으로 해버리면 객체교환이 힘들다. 밑의 LgTv가 에러.
    	tv.powerOn();
        tv.powerOff();
        //현재 tv라는 변수가 samsungtv를 인스턴스화 시킨 것이므로, powerOn/Off를 하면 삼성클래스의 메서드가 실행된다. 
        
     
        //이번에는 엘지 클래스 설계도를 기반으로 인스턴스를 생성하여 그것을 tv라는 변수에 담았다. 
        tv = new LgTV();
        tv.powerOn();
        tv.powerOff();
        
        
        Pencil pencil = null;
        pencil = new Pencil4B();
        pencil.selectPencil();
        pencil.pencilInterface(); //pencilInterface가 가지고 있는 기본 메서드. "나는 인터페이스 객체다" 호출.
        
        pencil = new Pencil6B();
        pencil.selectPencil();
        
        pencil = new Pencil4B();
        pencil.selectPencil();
        
        System.out.println("======================================");
        // myPrint부분부터 시작하는 부분. 
        MyPrint myPrint = new MyPrint(); 
        //2~3개를 활용하는 경우엔 경우엔 자신을 객체로 만드는 걸 추천. 
        myPrint.powerOn();
        myPrint.selectPencil();
        myPrint.powerOff();
        
        System.out.println("======================================");
        //testinterface부분 수업부터. 
        
        RemoteController rc = new SamsungTV();
//        rc = new LgTV();   //주석을 해제하면 LgTv내용이 출력된다. 부품교제와 유사.
        TestInterface ts = new TestInterface(rc);  //'rc'처럼 인스턴스도 매개변수로 가능.
        
        //바로 위를 밑에처럼 표현해도 가능.
//        RemoteController rc;
////      rc = new LgTV();   //주석을 해제하면 LgTv내용이 출력된다. 부품교제와 유사.
//      TestInterface ts = new TestInterface(new SamsungTV());  //'rc'처럼 인스턴스도 매개변수로 가능.
        
        rc = ts.rcReturn();
        rc.powerOn();
        rc.powerOff();
        ts.toString();
        
        System.out.println("=================4번째====================");
//        MyPrint myPrint = new MyPrint(new Pencil4B()); 
//        myPrint.toPrint();
        
        
        System.out.println("==============TryCatchTest============");
        
        TryCatchTest trycatchtest = new TryCatchTest();
        try{
        	trycatchtest.method1();
        } catch(Exception e) {
        	e.printStackTrace();
        }finally {
        	System.out.println("항상 실행하는 구문.");
        }
    }
}
