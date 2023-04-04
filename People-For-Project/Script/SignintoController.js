 // Create a ItemsController class
 class SignintoController {
    // Set up the items and currentId property in the contructor
    constructor(currentId = 0) {
        this.signinto = [];
        this.currentId = currentId;
    }

    // Create the addItem method
    addSigninto( fullname, email, contact,gender, password) {
        const signinto = {
            // Increment the currentId property
            id: this.currentId++,
           fullname: fullname,
            email:email,
            contact: contact,
            gender: gender,
            password: password
        };

        // Push the item to the items property
        this.signinto.push(signinto);

        //Save items to local storage
        localStorage.setSigninto("signinto", JSON.stringify(this.posts));

        this.uploadSigninto({  });
    }

    save({  fullname, email, contact,gender, password}){
        const data = {  fullname, email, contact,gender, password };

        fetch('http://localhost:8080/signinto', {
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

    update({ fullname, email, contact,gender, password}){
        const data = {  fullname, email, contact,gender, password };
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