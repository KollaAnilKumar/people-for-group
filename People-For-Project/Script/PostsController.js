 // Create a ItemsController class
class PostsController {
    // Set up the items and currentId property in the contructor
    constructor(currentId = 0) {
        this.posts = [];
        this.currentId = currentId;
    }

    // Create the addItem method
    addPost(name, description, imageUrl, retwitts, heart) {
        const post = {
            // Increment the currentId property
            id: this.currentId++,
            name: name,
            description: description,
            imageUrl: imageUrl,
            retwitts: retwitts,
            heart: heart
        };

        // Push the item to the items property
        this.posts.push(post);

        //Save items to local storage
        localStorage.setPost("posts", JSON.stringify(this.posts));

        this.uploadPost({name, description,imageUrl, retwitts, heart });
    }

    save({name, description, imageUrl,retwitts, heart}){
        const data = { name,  description, imageUrl, retwitts, heart };

        fetch('http://localhost:8080/post', {
        method: 'POST', // or 'PUT'
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(data),
        })
        .then(response => response.json())
        .then(data => {
        console.log('Success:', data);
        })
        .catch((error) => {
        console.error('Error:', error);
        });
    }

    update({name, description, imageUrl,  retwitts, heart}){
        const data = { name,  description, imageUrl, retwitts, heart };
        //TODO implement this method
        fetch('http://localhost:8080/post', {
            method: 'PUT',  
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(data),
            })
            .then(response => response.json())
            .then(data => {
            console.log('Success:', data);
            })
            .catch((error) => {
            console.error('Error:', error);
            });
    }

    delete(id){
 
        //TODO implement this method
        fetch('http://localhost:8080/pos/{id}', {
            method: 'DELETE',  
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(data),
            })
            .then(response => response.json())
            .then(data => {
            console.log('Success:', data);
            })
            .catch((error) => {
            console.error('Error:', error);
            });
    }

        
      
   

    findById(id){
       
        //TODO implement this method
        fetch('http://localhost:8080/pos/{id}', {
            method: 'DELETE',  
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(data),
            })
            .then(response => response.json())
            .then(data => {
            console.log('Success:', data);
            })
            .catch((error) => {
            console.error('Error:', error);
            });
    }
}