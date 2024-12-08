class Person{
    #name;
    #sem;
    #collage;//private
    pub=10;//public
    _pro=20;//protected
    constructor(name,sem){
        this.#name=name;
        this.#sem=sem;
        this.#collage="DU";
    }
    display(){
        console.log(this.#name);
        console.log(this.#sem);
        console.log(this.#collage);
    }
}

const p1=new Person("Ghanshyam",18);
const p2=new Person("xyz",17);

console.log(p1.display());
console.log(p2.display());
console.log(p1.name);
console.log(p1.pub);
console.log(p1._pro);


