    import java.util.Objects;

    public class Product {
        private int id;          // артикул
        private String name;
        private int price;
        private String category;

        public Product(int id, String name, int price, String category) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.category = category;
        }

        public int getId() {
            return id;
        }

        public String getCategory() {
            return category;
        }

        @Override
        public String toString() {
            return "Товар[артикул=" + id + ", название=" + name
                    + ", цена=" + price + ", категория=" + category + "]";
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Product other = (Product) obj;
            return id == other.id
                    && Objects.equals(category, other.category);
        }
    }

