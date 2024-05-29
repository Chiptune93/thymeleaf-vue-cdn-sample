import GreetingMessage from './greetingComponent.js';
import ItemList from './itemListComponent.js';

document.addEventListener('DOMContentLoaded', function() {
    const app = Vue.createApp({
        components: {
            'greeting-message': GreetingMessage,
            'item-list': ItemList
        }
    });
    app.mount('#app');
});
