package models;
public enum DishCategory {
    APPETIZER{  
        @Override
        public String toString(){
                return "Type: APPETIZER";
            }},
    MAINCOURSE{  
        @Override
        public String toString(){
                return "Type: MAINCOURSE";
            }},
    DESSERT{  
        @Override
        public String toString(){
                return "Type: DESSERT";
            }},
    
}
