
class Main {
    public static void main(String[] args) {
        ListaLigada listaLigada = new ListaLigada(1);
        // listaLigada.removeFirst();
        // listaLigada.append(1);
        listaLigada.append(2);
        listaLigada.append(3);
        listaLigada.append(4);
        listaLigada.append(5);
        listaLigada.append(6);
        listaLigada.append(7);
        listaLigada.append(8);


        listaLigada.hasLoop();
        var k0 = listaLigada.findKthFromEnd(0);
        var k1 = listaLigada.findKthFromEnd(1);
        var k2 = listaLigada.findKthFromEnd(2);
        var k3 = listaLigada.findKthFromEnd(3);
        var k4 = listaLigada.findKthFromEnd(4);
        var k5 = listaLigada.findKthFromEnd(5);
        var k6 = listaLigada.findKthFromEnd(6);
        var k7 = listaLigada.findKthFromEnd(7);
        var k8 = listaLigada.findKthFromEnd(8);
        var k9 = listaLigada.findKthFromEnd(9);

        System.out.println(k0 + " <-- valor do K0 from the end\n");
        System.out.println(k1.getValue() + " <-- valor do K1 from the end\n");
        System.out.println(k2.getValue() + " <-- valor do K2 from the end\n");
        System.out.println(k3.getValue() + " <-- valor do K3 from the end\n");
        System.out.println(k4.getValue() + " <-- valor do K4 from the end\n");
        System.out.println(k5.getValue() + " <-- valor do K5 from the end\n");
        System.out.println(k6.getValue() + " <-- valor do K6 from the end\n");
        System.out.println(k7.getValue() + " <-- valor do K7 from the end\n");
        System.out.println(k8.getValue() + " <-- valor do K8 from the end\n");
        System.out.println(k9 + " <-- valor do K9 from the end\n");

    }
}