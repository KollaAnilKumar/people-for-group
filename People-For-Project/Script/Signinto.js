// Initialize a new ItemsController with currentId set to 0
const postsController = new PostsController(0);

// Select the New Item Form
const newPostsForm = document.querySelector('#create-post-form');

// Add an 'onsubmit' event listener
newPostsForm.addEventListener('submit', (event) => {
    // Prevent default action
    event.preventDefault();

    // Select the inputs
    const newPostsName = document.querySelector('#posts-container');
    const newPostsDescription = document.querySelector(' .post');
    const newPostsImageUrl = document.querySelector('.post__img');    

    // Get the values of the inputs
    const name = newPostsName.value;
    const description = newPostsDescription.value;
    const imageUrl = newPostsImageUrl.value;

    /*
        Validation code here
    */

    // Add the item to the ItemsController
    postsController.save(fullname, email, contact,gender, password);

    // Clear the form
    newPostsName.value = '';
    newPostsDescription.value = '';    
});