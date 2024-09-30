const products = [
    { id: 1, name: "Laptop", price: 999.99, category: "Electronics", stock: 25 },
    { id: 2, name: "Smartphone", price: 699.99, category: "Electronics", stock: 50 },
    { id: 3, name: "Coffee Maker", price: 49.99, category: "Home Appliances", stock: 15 },
    { id: 4, name: "Wireless Headphones", price: 89.99, category: "Accessories", stock: 30 },
    { id: 5, name: "Gaming Mouse", price: 59.99, category: "Accessories", stock: 20 },
    { id: 6, name: "Bluetooth Speaker", price: 129.99, category: "Electronics", stock: 40 },
    { id: 7, name: "4K Monitor", price: 299.99, category: "Electronics", stock: 10 },
    { id: 8, name: "Air Fryer", price: 89.99, category: "Home Appliances", stock: 12 },
    { id: 9, name: "Smartwatch", price: 199.99, category: "Wearables", stock: 35 },
    { id: 10, name: "Backpack", price: 49.99, category: "Accessories", stock: 60 }
];

const category_ele=products.filter(p=>p.category==="Electronics");
console.log(category_ele);
const find_product=products.find(p=>p.name=="Smartwatch");
console.log(find_product);
const total=products.reduce((t,p)=>t+p.price,0);
console.log(total);
const filter_pro=products.filter(p=>p.stock>40);
console.log(filter_pro);
