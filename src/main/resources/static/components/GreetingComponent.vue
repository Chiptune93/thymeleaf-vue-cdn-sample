<!--src/main/resources/static/components/GreetingComponent.vue-->
<template>
  <div>
    <h1>{{ message }}</h1>
  </div>
</template>

<script>
export default {
  data() {
    return {
      message: 'Hello from MyComponent!'
    }
  }
}
</script>

<style scoped>
h1 {
  color: blue;
}
</style>
