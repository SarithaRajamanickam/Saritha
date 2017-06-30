public class DeleteArray {
public static void main(String[] arguments) {

int arg[] = { 5, 6, 8, 9, 10 };

int pos = 3;

for (int k = 0; k < arg.length; k++) {
System.out.println(arg[k]);
}
for (int i = 0; i < arg.length; i++) {

if (pos == i) {
for (int j = i + 1; i < arg.length - 1; j++) {
arg[i] = arg[j];
i++;
}
}
}

System.out.println("The output of Array After Delete");
for (int i = 0; i < arg.length - 1; i++) {
System.out.println(arg[i]);
}
}
}