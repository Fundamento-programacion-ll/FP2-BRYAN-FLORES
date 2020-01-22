# FP2-BRYAN-FLORES <h1>
## titulo 2 <h2>
### titulo 3 <h3>
#### titulo 4 <h4>
<h5> titulo 5 </h5>
<h6> titulo 6 </h6>

*Bryan* _**Flores**_ 20 *~~23~~*

## **Lista no Ordenada**

* _Bryan_
+ _Paul_
- _Kevin_

## **Lista Ordenada**

1. ~~Hola~~
2. ~~Chao~~
3. ~~Hablámos~~

### **Para poner link:** [_**--->YOUTUBE<---**_](https://www.youtube.com/)


![YOUTUBE](https://upload.wikimedia.org/wikipedia/commons/thumb/0/09/YouTube_full-color_icon_%282017%29.svg/1280px-YouTube_full-color_icon_%282017%29.svg.png)


## **Código Validar Cédula Ecuatoriana**


```Java
public static void main(String[] args) {
        
        int c;
        int suma=0;
        int acum;
        int resta=0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de cédula");
        String cedula=scan.next();
        
        
        
        for (int i = 0; i < cedula.length()-1; i++) {
            
            c=Integer.parseInt(cedula.charAt(i)+"");
            if(i%2==0){
                c=c*2;
                if(c>9){
                    c=c-9;
                }
            }
            
            suma=suma+c;
        }
        
        if (suma%10 !=0) {
            acum=((suma/10)+1)*10;
            resta=acum-suma;
        }
        
        int ultimo=Integer.parseInt(cedula.charAt(9)+"");
        
        if (ultimo==resta) {
            System.out.println("la cédula ingresa es correcta");
        }else{
            System.out.println("la cedula es incorrecta");
        }
        
    }
```

::