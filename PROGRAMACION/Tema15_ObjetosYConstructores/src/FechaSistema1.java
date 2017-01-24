import java.util.Calendar;
public class FechaSistema1 {
int dia=0,mes=0,anio=0;
		FechaSistema1(){
			Calendar c= Calendar.getInstance();//Crea un objeto de tipo Calendar
			dia=c.get(Calendar.DATE);//Obtenemos el dia
			mes=c.get(Calendar.MONTH)+1;//El mes va de 0 a 11 por eso sumamos 1
			anio=c.get(Calendar.YEAR); //Obtenemos el año
		}
		FechaSistema1(int d,int m,int a){
			dia=d;
			mes=m;
			anio=a;
		}
		
		FechaSistema1(String fecha){
			String[] fechaSpliteada = fecha.split("/");
			this.dia = Integer.parseInt(fechaSpliteada[0]);
			this.mes = Integer.parseInt(fechaSpliteada[1]);
			this.anio = Integer.parseInt(fechaSpliteada[2]);
		}
		
		void MostrarFecha(){
			System.out.println(dia+"/"+mes+"/"+anio);
		}
		public String toString() {
			return "FechaSistema [dia=" + dia + ", mes=" + mes + ", anio=" + anio+ "]"; //return dia+"/"+mes+"/"+anio;
		}
		
		public static void main(String[] args) {
		FechaSistema1 F=new FechaSistema1();
		F.MostrarFecha();
		FechaSistema1 F1=new FechaSistema1(13,8,2015);
		System.out.println(F1.toString());
		
		FechaSistema1 F2= new FechaSistema1("1/10/2017");
		System.out.println(F2.toString());
		}
}
