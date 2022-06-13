let array = [ 
	'iroman@digitalhouse.com',
	'loki%digitalhouse.com',
	'loki@digitalhouse.com',
	'thanosdigitalhouse.com',
	'thanos@digitalhouse.com'
];

console.log(array[0]);
// ---------------------------------------------------

let array = [ 
	'iroman@digitalhouse.com',
	'loki%digitalhouse.com',
	'loki@digitalhouse.com',
	'thanosdigitalhouse.com',
	'thanos@digitalhouse.com'
];

let array2 = [ 
	'iroman@digitalhouse.com',
	'Mario',
	'Juani',
	'Dayana',
	'thanos@digitalhouse.com'
];

array[0] = "Juani";
console.log(array[0]);
array[1] = "Mario";
console.log(array[1]);
array[2] = "Dayana";
console.log(array[2]);
array[3] = "Laura";
console.log(array[3]);

array.push("Pepe")
console.log(array)


let elemento = array[2];
console.log (elemento)
console.log (array2)


function comparar (array , array2){
  if (array[0]===array2[1])
  console.log ("Este elemento estae en el otro ")
  else 
    console.log("NO esta")
  }

comparar(array , array2);

let numbers =[22, 33, 54, 66, 72]
console.log(numbers.length)



let grupoDeAmigos = [ "Harry", "Ron", "Hermione", "Spiderman", "Hulk", "Ironman","Penélope Glamour", "Pierre Nodoyuna","Patán" ]
console.log(grupoDeAmigos[5])



let str = "un string cualquiera"
let arrayAleatorio= ["Digital", "House", "true", "string", "123","false", "54", str ]
console.log(arrayAleatorio[arrayAleatorio.length-2])


