// Object
// object is used to store mutiple clllections of data

  const names = ["Arun", "Bala", "Deva"];
  const card_text = ["Lorem ipsum dolor sit amet consectetur adipisicing elit.Est unde quas laborum accusantium molestias velit mollitia alias quia earum repudiandae odio molestiae modi possimus aut, nisi magni quos.Dicta, cupiditate."]
  const card_images = ["https://via.placeholder.com/500x150", "https://via.placeholder.com/500x150", "https://via.placeholder.com/500x150", "https://via.placeholder.com/500x150"]

//   Syntax

//   const object = { "key" : "value" }

  const object = { 
    "name" : "Arun" ,
    "image" : "https://via.placeholder.com/500x150" ,
    "desc" : "Lorem ipsum dolor sit amet consectetur adipisicing elit.Est unde quas laborum accusantium molestias velit mollitia alias quia earum repudiandae odio molestiae modi possimus aut, nisi magni quos.Dicta, cupiditate."
};

  const object_1 = { "name" : "Ajith" };
  





  const name_list =  [ { 
    "name" : "Arun" ,
    "image" : "https://via.placeholder.com/500x150" ,
    "desc" : "Lorem ipsum dolor sit amet consectetur adipisicing elit.Est unde quas laborum accusantium molestias velit mollitia alias quia earum repudiandae odio molestiae modi possimus aut, nisi magni quos.Dicta, cupiditate."
    } ,
   {"name" : "Ajith" ,
    "image" : "https://via.placeholder.com/500x150" ,
    "desc" : "Lorem ipsum dolor sit amet consectetur adipisicing elit.Est unde quas laborum accusantium molestias velit mollitia alias quia earum repudiandae odio molestiae modi possimus aut, nisi magni quos.Dicta, cupiditate."
    }  ]


        // object ["key"]

        console.log(object["name"]);
        object.name;

        // object["key"] = "value"

       object["role_number"] = 678968

       console.log(object);

    //    delete object

       delete object["name"]