# heap-test

# 자바 힙

힙이란 `최솟값 또는 최댓값을 빠르게 찾아내기 위해 완전이진트리 형태로 만들어진 자료구조`이다

여기서 중요한 키워드 3가지는 `최솟값 또는 최댓값`, `빠르게`,`완전이진트리` 이다.

### 트리

<img src="https://velog.velcdn.com/images/shkim1199/post/f8b384e0-a446-4a76-9735-6068c579fd99/image.png" style="zoom:50%;" />

우와 같은 구조를 Tree 구조 라고 한다.

거꾸로 보면 나무 같이 생겨서 tree 구조라고 한다

`부모노드(parent node)` : 자기 자신(노드) 와 연결된 노드 중 자신보다 높은 노드를 의미 (ex. F의 부모노드 : B)

`자식 노드(child node)` : 자기 자신(노드)과 연결 된 노드 중 자신보다 낮은 노드를 의미 (ex. C의 자식노드 : G, H)

`루트 노드 (root node)`: 일명 뿌리 노드라고 하며 루트 노드는 하나의 트리에선 하나밖에 존재하지 않고, 부모노드가 없다. 위 이미지에선 **녹색**이 뿌리노드다.

`단말 노드(leaf node)` : 리프 노드라고도 불리며 자식 노드가 없는 노드를 의미한다. 위 이미지에서 **주황색 노드**가 단말노드다.

`내부 노드(internal node)`: 단말 노드가 아닌 노드

`형제 노드(sibling node)` : 부모가 같은 노드를 말한다. (ex. D, E, F는 모두 부모노드가 B이므로 D, E, F는 형제노드다.)

`깊이(depth)` : 특정 노드에 도달하기 위해 거쳐가야 하는 '간선의 개수'를 의미 (ex. F의 깊이 : A→B→F 이므로 깊이는 2가 됨)

`레벨(level)` : 특정 깊이에 있는 노드들의 집합을 말하며, 구현하는 사람에 따라 0 또는 1부터 시작한다. (ex. D, E, F, G, H)

`차수(degree)` : 특정 노드가 하위(자식) 노드와 연결 된 개수 (ex. B의 차수 = 3 {D, E, F} )

### 이진트리

위 트리 구조에서 특정한 형태로 제한을 하게 되는데, 모든 노드의 최대 차수를 2로 제한한 것이다.

조금 쉽게 말하자면 각 노드는 자식노드를 최대 2개까지밖에 못갖는 것

이를 `이진트리(Binary Tree)` 라고 한다.

위의 이미지에서는 B노드의 차수가 3이므로 이진트리가 아니다.

밑에가 이진트리

<img src="https://velog.velcdn.com/images/shkim1199/post/0624461c-3a3a-481c-9db2-781e62591915/image.png" style="zoom:50%;" />

### 완전이진트리(complete binary tree)

마지막 레벨을 제외한 모든 노드가 채워져 있으면서 모든 노드(= 사실상 마지막 레벨의 노드들) 가 왼쪽부터 채워져있어야 한다.

즉 완전 이진트리는 이진트리에서 두 가지 조건을 더 만족해야 하는 것

1. 마지막 레벨을 제외한 모든 노드가 채워져있어야함
2. 모든 노드들은 왼쪽부터 채워져 있어야함

### 포화 이진트리(perfect binary tree)

마지막 레벨을 제외한 모든 노드는 두 개의 자식노드를 갖는다

------

![image-20220728164657300](/Users/kimsunghoon/Library/Application Support/typora-user-images/image-20220728164657300.png)

그럼 이제 힙(Heap)은 어떻게 구현이 될까

우리가 어떤 리스트에 값을 넣었다고 빼낼려고 할 때, 우선순위가 높은 것 부터 빼내려고 할 때 보통 정렬을 떠올린다.

쉽게 생각해서 숫자가 낮을 수록 우선순위가 높다고 가정할 때 매번 새 원소가 들어올 때 마다 이미 리스트에 있던 원소들과 비교를 하고 정렬 해야 한다.

하지만 이렇게 하면 비효율적 이기 때문에 좀 더 효율이 좋게 만들기 위하여 다음과 같은 조건을 붙힌다.

```
부모 노드는 항상 자식 노드보다 우선수위가 높다
```

즉, 모든 요소들을 고려하여 우선순위를 정할 필요 없이 부모 노드는 자식노드보다 항상 우선순위가 앞선다는 조건만 만족시키며 완전이진트리 형태로 채워나가는 것이다.

<img src="https://velog.velcdn.com/images/shkim1199/post/bbee2e78-2280-4ffe-839d-c670361af11d/image.png" style="zoom:50%;" />

조금만 다르게 생각해보면 루트 노드는 항상 우선순위가 높은 노드라는 것이다.

이러한 원리로 최댓값 혹은 최솟값을 빠르게 찾아낼 수 있다는 장점(시간복잡도 : O(1))과 함께 삽입 삭제 연산시에도 부모노드가 자식노드보다 우선순위만 높으면 되므로 결국 트리의 깊이만큼만 비교를 하면 되기 때문에 O(logN) 의 시간복잡도를 갖아 매우 빠르게 수행할 수 있다.

그리고 위에 사진처럼 부모노드와 자식노드간의 관계만 신경쓰면 되기 떄문에 형제 간 우선순위는 고려되지 않는다.

이러한 정렬 상태를 흔히 '반 정렬 상태' 혹은 '느슨한 정렬 상태', '약한 힙' 이라고도 불린다.

### Heap의 종류

힙은 우선순위가 높은 순서대로 나온다고 했는데, 이 말은 어떻게 우선순위를 매기냐에 따라 달라지겠지만, 기본적으로 정수, 문자, 문자열 같은 경우 언어에서 지원하는 기본 정렬 기준들이 있다.

예를들어 정수나 문자의 경우 낮은 값이 높은 값보다 우선한다.

우리가 예로 {3,1,6,4} 를 정렬한다고 하면 낮은 순서대로 {1,3,4,6} 이렇게 정렬하게 된다.

이렇게 정렬되는 순서, 즉 기본적으로 어떤 것을 우선순위가 높다고 할지에 따라 두 가지로 나뉜다.

<img src="https://velog.velcdn.com/images/shkim1199/post/b1c4d9c1-c82f-408f-92a2-559e82097332/image.png" style="zoom:50%;" />

