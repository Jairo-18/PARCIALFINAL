public class Principal {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        LibroElectronico libroElectronico1 = new LibroElectronico("El otoño del patriarca", "Gabriel García Márquez", 1975, "EPUB");
        LibroElectronico libroElectronico2 = new LibroElectronico("Diario de un loco", "Lu Xun", 1918, "EPUB");
        LibroElectronico libroElectronico3 = new LibroElectronico("Al faro", "Virginia Woolf", 1927, "PDF");
        LibroElectronico libroElectronico4 = new LibroElectronico("Hojas de hierba", "Walt Whitman", 1855, "EPUB");
        LibroElectronico libroElectronico5 = new LibroElectronico("Guerra y paz", "Lev Tostói", 1877, "PDF");

        LibroFisico libroFisico1 = new LibroFisico("Crónica de una muerte anunciada", "Gabriel García Márquez", 1981, 225);
        LibroFisico libroFisico2 = new LibroFisico("Poemas", "Paul Ceran", 1952, 1567);
        LibroFisico libroFisico3 = new LibroFisico("Decámeron", "Giovanni Boccaccio", 1349, 168);
        LibroFisico libroFisico4 = new LibroFisico("Mil novecientos ochenta y cuatro", "George Orwell", 1949, 328);
        LibroFisico libroFisico5 = new LibroFisico("Medea", "Euripides", 431, 510);

        biblioteca.agregarLibro(libroFisico1);
        biblioteca.agregarLibro(libroFisico2);
        biblioteca.agregarLibro(libroFisico3);
        biblioteca.agregarLibro(libroFisico4);
        biblioteca.agregarLibro(libroFisico5);

        biblioteca.agregarLibro(libroElectronico1);
        biblioteca.agregarLibro(libroElectronico2);
        biblioteca.agregarLibro(libroElectronico3);
        biblioteca.agregarLibro(libroElectronico4);
        biblioteca.agregarLibro(libroElectronico5);

        biblioteca.imprimirLibros();
    }
}



