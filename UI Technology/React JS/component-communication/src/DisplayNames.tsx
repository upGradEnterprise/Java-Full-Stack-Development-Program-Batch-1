function DisplayNames(props:any) {

return(
    <div>
        <h3>All Names are </h3>
        <ul>
            {props.data.map((name:string)=><li>{name}</li>)}
        </ul>
    </div>
)
}

export default DisplayNames;