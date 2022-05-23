const state = {
    personalData: {
        name: "Sandra",
        lastname: "Bullock",
        age: 57,
        nationality: "American",
        residence: "New York",
        occupation: "Actress/ Producer",
        avatar: "https://e00-elmundo.uecdn.es/assets/multimedia/imagenes/2022/03/16/16474182162843.jpg"
    },
    experience: [
        { id: 1, movie: "La propuesta "},
        { id: 2, movie: "Un sueño posible"},
        { id: 3, movie: "Bird Box"}
    ],
    education: [
        { id: 1, institute: "Universidad del Este de Carolina."},
        { id: 2, institute: "Washington-Liberty High School"},
    ],

    bio: "Sandra Annette Bullock (Arlington, Virginia; 26 de julio de 1964) es una actriz, directora y productora estadounidense de cine y televisión. Es conocida por su participación en películas como Speed, Miss Congeniality, The Proposal, Gravity, Ocean's 8 y The Blind Side, por la que fue galardonada con el Óscar a la mejor actriz, el Globo de Oro a la mejor actriz en drama, el Premio del Sindicato de Actores a la mejor actriz protagonista y el Premio de la Crítica Cinematográfica a la mejor actriz.3​4​5​6​ También intervino en Crash, largometraje ganador del premio a mejor película en la 78ª edición de los Premios Óscar.7​"

}


// Esta es la barra de navegación 
const Header =()=>{
    return (
        <header >
            <nav >
                <ul className="nav">
                    <li>Home</li>
                    <li>About</li>
                    <li>experience</li>
                    <li>Movies</li>
                </ul>
            </nav>
        </header>
    )
};



// Esta es la informacion que vamos a renderizar, Los datos son los de la variable state
const Info = ({ name, nationality, age, occupation, avatar})=>{
    return (
        <main>
            <section>
                <h1>Name: {name}</h1>
                <p>Nationality: {nationality}</p>
                <p>Age: {age} years old</p>
                <p>Occupation: {occupation}</p>

            </section>
            <section style={{width: "300px"}}>
                <img style={{ width: "160px", height: "160px"}}
                    src={avatar} alt="profile picture"/>
            </section>
        </main>
    )
};


// Esta variable tiene la llave valor de la propiedad bio 
const Bio = ({bio}) => {
    return(
        <p> {bio} </p>
    )
}
const {bio} = state;

// Esta variable tiene la llave valor de la propiedad Experience
const Experience = ({ experience })=>{
    return (
        <li> {experience} </li>
    )
}

const { experience } = state; 


// Esta variable tiene la llave valor de la propiedad Education
const Education = ({ institute })=>{
    return(
        <li> {institute} </li>
    )
}

const { education } = state;


const App = (
    <div>
        <Header/>
        <Info
            name={state.personalData.name}
            nationality={state.personalData.nationality}
            age={state.personalData.age}
            occupation={state.personalData.occupation}
            avatar={state.personalData.avatar}
            bio={state.personalData.bio}
        />

        <p>
             : {state.personalData.bio}
        </p>

        <ul>
            {
                  experience.map(item =>
                    <Experience 

                    key={item.id}
                    experience={item.movie}
                    
                    />

                    )
            }
        </ul>

        <ul>
            {
                education.map(item =>
                    <Education 
                        key={item.id}
                        institute={item.institute}
                    
                    />
                )
            }
        </ul>
    </div>
);

const htmlElement = document.getElementById("root");

ReactDOM.render(App, htmlElement);