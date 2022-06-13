const products = [

    {id: 1, name: 'Tshirt', isStock: false},
    {id: 2, name: 'Pants', isStock: false},
    {id: 3, name: 'Shorts', isStock: true},
    {id: 4, name: 'Shoes', isStock: false},
    {id: 5, name: 'Bracelets', isStock: true},

]

/*const liFirst = React.createElement(

    "li",
    {key: 1},
    `${products[0].name}`

)

const liSecond = React.createElement(

    "li",
    {key: 2},
    `${products[1].name}`

)

const liThree = React.createElement(

    "li",
    {key: 3},
    `${products[2].name}`

)

const ul = React.createElement(

    "ul",
    null,
    null,

    // renderizar hijos "Children"
    [liFirst, liSecond, liThree]
)*/



const App = (
    <div>
        <ul>
        {
            products.map((product) =>   {

                return (<li key = {product.id}  >  {products.name}</li>)
            })
        }
        </ul>    
    </div>
)


const hookefElement = document.getElementById("root");
ReactDOM.render(ul, hookefElement);